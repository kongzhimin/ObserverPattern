public class ConcreteSubjectB extends SubjectS {
    public  ConcreteSubjectB(){
        super();
    }
    public void notifyObserver(){
        System.out.println("B目标发生改变了");
        for(Observer0 obs:observers){
            obs.response();
        }
    }
}
