//abstract không hỗ trợ đa kế thừa, còn implement có thể thực thi nhiều interface(tạm gọi là đa kế thừa)
public class Random extends User implements UserMethod,AnimalMethod{
    @Override
    public void eat() {

    }

    @Override
    public void run() {

    }
}
