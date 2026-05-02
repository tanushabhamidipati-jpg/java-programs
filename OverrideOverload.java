class Animal
{
void sound()
{
System.out.println("animal make sounds");
}
}
class Dog extends Animal
{
void sound()
{
System.out.println("Bowh Bowh");
}
}
class Cat extends Dog
{
void sound()
{
System.out.println("Meow Meow");
}
}
class OverrideOverload
 {
public static void main(String args[])
{
Animal a =new Dog();
a.sound();
Animal a1=new Cat();
a1.sound();
}
}