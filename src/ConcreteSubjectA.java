public class ConcreteSubjectA extends SubjectS {
    public  ConcreteSubjectA(){
        super();
    }
    public void notifyObserver(){
        System.out.println("A目标发生改变了");
        for(Observer0 obs:observers){
            obs.response();
        }
    }
}
