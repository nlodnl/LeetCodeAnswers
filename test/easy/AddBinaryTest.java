package easy;

public class AddBinaryTest {

    public static void main(String[] args) {
        AddBinary.Solution s = new AddBinary().new Solution();
        System.out.println(s.addBinary("11", "1"));
        System.out.println(s.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }
}
