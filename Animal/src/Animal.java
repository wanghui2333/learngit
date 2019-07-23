public class Animal {
//    定义一个动物类，具有年龄，体重，跑动和吃东西等属性和方法，为属性生成相应的get和set方法以及构造方法。

    protected int age;
    protected double weight;
    // true：吃
    protected boolean run;
    protected String eat;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }
}
