package CreationalPatterns.PrototypePattern;

public class ConcreteType extends ProtoType{
    @Override
    public ProtoType clone() {
        System.out.println("clone成功");
        return new ConcreteType();
    }
}
