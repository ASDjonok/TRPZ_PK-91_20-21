package test;

public class Solution {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.new Inner();
        new Outer.Nested();
    }
}
