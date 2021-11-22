package student.qa;


public class Сalories {
    private String name;
    private double calories;
    private int gram;
    private int price;
    private Taste taste;

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        if (calories >= 0)
            this.calories = calories;
    }

    public int getGram() {
        return gram;
    }

    public void setGram(int gram) {
        if (calories >= 0)
            this.gram = gram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Сalories (String name, double calories, int gram, int price){
        this.name = name;
        this.calories = calories;
        this.gram = gram;
        this.price = price;
    }


    void sayDiet() {System.out.println("Название:" + name +",калории:" + " " + getCalories() * getGram() +
            ",Цена за завтрак:" + getPrice());

    }

    public static void sayClassName(){
        System.out.println(Сalories.class.getName());
    }

    static class Taste {
        Boolean flavour;
    }
}

