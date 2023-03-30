package HW6;

public class Task1 {

    int Width;
    int Length;
    int Height;

    public Task1(int[] sides){
        Width = sides[0];
        Length = sides[1];
        Height = sides[2];
    }

    public int getWidth(){
        return Width;
    }

    public int getLength() {
        return Length;
    }

    public int getHeight() {
        return Height;
    }

    public int getVolume() {
        return Width * Length * Height;
    }

    public int getSurfaceArea() {
        return  2 * (Length * Width + Width * Height + Height * Length);
    }



    public static void main(String[] args) {

        Task1 task1 = new Task1(new int[]{2,4,6});

        int total = task1.getVolume();
        int total2 = task1.getSurfaceArea();

        System.out.println(total);
        System.out.println(total2);
    }

}
