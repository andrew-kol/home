public class Main {
    public static void main(String[] args) {
        var box=5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box/4;
        System.out.println(box);

        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println("��� ����� �������� "+ capacityLeft+ " �� �����");

        var appleWeight = 2;
        var orangesWeight = 3;
        var fruitsWeight = appleWeight+orangesWeight;
        System.out.println("����� ��� ������� "+ fruitsWeight);

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumbersWeight = 2;
        var peppersWeight = 2;
        var zucchiniWeight = 2;
        var vegetablesWeight = tomatoesWeight+cucumbersWeight+peppersWeight+zucchiniWeight;
        var productsWeight = fruitsWeight+vegetablesWeight+meatWeight+waterWeight;
        System.out.println("����� ��� ��������� "+ productsWeight+ " ��!");

        var leftWeight = liftingCapacity-stuffWeight-productsWeight;
        System.out.println("����� �������� "+ leftWeight+ " ��!");

        productsWeight = productsWeight*2;
        System.out.println("������ ��� ��������� "+ productsWeight);

        leftWeight = liftingCapacity-stuffWeight-productsWeight;
        System.out.println("������ ����� �������� "+ leftWeight+ " ��!");

        var overLoad = (stuffWeight+productsWeight)% liftingCapacity;
        System.out.println("�������� �� "+ overLoad+ " ��!");

        var productsInOneCar = productsWeight/2;
        System.out.println("��������� � ����� ������ ������ "+ productsInOneCar+ " ��!");

        short bananas = 200;
        System.out.println("������� "+ bananas +" ��");

        float sugar = 3;
        float onePortion = sugar/4;
        System.out.println("���� ������ ������ ����� " + onePortion+ " ��");

        byte a = 1;
        short b = 1;
        int c = 1;
        int d = a+b+c;
        System.out.println(d);

        float g = a+1f;
        System.out.println(g);




    }
}
