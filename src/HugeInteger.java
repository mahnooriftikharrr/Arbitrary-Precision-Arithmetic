import java.util.ArrayList;

public class HugeInteger implements Comparable<HugeInteger> {

    private final ArrayList<Integer> digits;

    public HugeInteger() {
        digits = new ArrayList<>();
        digits.add(0);
    }

    public HugeInteger(int i) {
        digits = new ArrayList<>();
        if (i < 0)
            throw new NumberFormatException("Negative values not supported");
        if (i == 0) { digits.add(0);
            return;
        }
        while (i > 0) {
            digits.add(i % 10);
            i /= 10;
        }
        while (digits.size() > 1 && digits.getLast() == 0)
            digits.removeLast();
    }

    public HugeInteger(String s) {
        digits = new ArrayList<>();
        if (s == null || s.isEmpty())
            throw new NumberFormatException("Empty string");

        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c))
                throw new NumberFormatException("Invalid character in input: " + c);
        }

        for (int i = s.length() - 1; i >= 0; i--)
            digits.add(s.charAt(i) - '0');
        while (digits.size() > 1 && digits.getLast() == 0)
            digits.removeLast();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof HugeInteger)) return false;

        HugeInteger o = (HugeInteger) other;
        if (digits.size() != o.digits.size()) return false;
        for (int i = 0; i < digits.size(); i++) {
            if (!digits.get(i).equals(o.digits.get(i))) return false;
        }
        return true;
    }

    @Override
    public int compareTo(HugeInteger other) {
        if (digits.size() != other.digits.size())
            return Integer.compare(digits.size(), other.digits.size());
        for (int i = digits.size() - 1; i >= 0; i--) {
            int cmp = Integer.compare(digits.get(i), other.digits.get(i));
            if (cmp != 0) return cmp;
        }
        return 0;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = digits.size() - 1; i >= 0; i--) {
            result += digits.get(i);
        }
        return result;
    }

    public HugeInteger add(HugeInteger rhs) {
        HugeInteger result = new HugeInteger();
        result.digits.clear();
        int carry = 0;
        int maxSize = Math.max(digits.size(), rhs.digits.size());
        for (int i = 0; i < maxSize; i++) {
            int a = (i < digits.size()) ? digits.get(i) : 0;
            int b = (i < rhs.digits.size()) ? rhs.digits.get(i) : 0;
            int sum = a + b + carry;
            result.digits.add(sum % 10);
            carry = sum / 10;
        }
        if (carry > 0)
            result.digits.add(carry);
        while (result.digits.size() > 1 && result.digits.getLast() == 0)
            result.digits.removeLast();
        return result;
    }

    public int intValueExact() {
        HugeInteger maxInt = new HugeInteger(Integer.toString(Integer.MAX_VALUE));
        if (compareTo(maxInt) > 0)
            throw new ArithmeticException("Value out of range");
        int result = 0;
        for (int i = digits.size() - 1; i >= 0; i--)
            result = result * 10 + digits.get(i);
        return result;
    }

    public HugeInteger subtract(HugeInteger rhs) {
        if (compareTo(rhs) < 0)
            return new HugeInteger(0);
        HugeInteger result = new HugeInteger();
        result.digits.clear();

        int borrow = 0;
        for (int i = 0; i < digits.size(); i++) {
            int a = digits.get(i);
            int b = (i < rhs.digits.size()) ? rhs.digits.get(i) : 0;
            int diff = a - b - borrow;
            if (diff < 0) { diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result.digits.add(diff);
        }

        while (result.digits.size() > 1 && result.digits.getLast() == 0)
            result.digits.removeLast();
        return result;
    }
}
