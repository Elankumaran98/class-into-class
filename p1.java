class area
{
    int num;

    class a1 {
        public void print() {
            System.out.println("Eankumaran");
        }
    }

    void display_a1() {
        a1 inner = new a1();
        inner.print();
    }
}
class p1
{
    public static void main(String args[])
    {
        area outer = new area();
        outer.display_a1();
    }
}