package polymorphism;

import java.util.ArrayList;

class Animal {

  public void move() {
    System.out.println("동물이 움직입니다.");
  }

  public void eating() {
    System.out.println("동물이 먹습니다.");
  }

}

class Human extends Animal {

  @Override
  public void move() {
    System.out.println("사람이 두발로 걷습니다.");
  }

  public void readBooks() {
    System.out.println("사람이 책을 읽습니다.");
  }

}

class Tiger extends Animal {

  @Override
  public void move() {
    System.out.println("호랑이가 네 발로 뜁니다.");
  }

  public void hunting() {
    System.out.println("호랑이가 사냥을 합니다.");
  }

}

class Eagle extends Animal {

  @Override
  public void move() {
    System.out.println("독수리가 하늘로 날아갑니다.");
  }

  public void flying() {
    System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
  }

}

public class AnimalTest {

  public static void main(String[] args) {

    Animal hAnimal = new Human();
    Animal tAnimal = new Tiger();
    Animal eAnimal = new Eagle();

//    Eagle human = (Eagle) hAnimal; // 코드를 작성시에는 오류가 발생하지 않지만 실행하면 ClassCastException이 발생한다.

    if (hAnimal instanceof Eagle){ // 안정적으로 명시적 형변환을 할때는 instanceof로 체크를 해주는 것이 좋다.
      Human human = (Human) hAnimal;
      human.readBooks();
    }

//    AnimalTest test = new AnimalTest();
//    test.moveAnimal(hAnimal);
//    test.moveAnimal(tAnimal);
//    test.moveAnimal(eAnimal);

//    hAnimal.readBooks(); // 실행하려면 다운캐스팅을 해야함

    ArrayList<Animal> animalList = new ArrayList<Animal>();
    animalList.add(hAnimal);
    animalList.add(tAnimal);
    animalList.add(eAnimal);

    AnimalTest test = new AnimalTest();
    test.testDownCasting(animalList);

//    for (Animal animal : animalList) {
//      animal.move();
//    }

  }

  public void testDownCasting(ArrayList <Animal> list) {
    for (int i = 0; i<list.size(); i++) {
      Animal animal = list.get(i);

      if (animal instanceof Human) {
        Human human = (Human) animal;
        human.readBooks();
      } else if (animal instanceof Tiger) {
        Tiger tiger = (Tiger) animal;
        tiger.hunting();
      } else if (animal instanceof Eagle) {
        Eagle eagle = (Eagle) animal;
        eagle.flying();
      } else {
        System.out.println("error");
      }
    }
  }

  public void moveAnimal(Animal animal) {
    animal.move();
  }

}
