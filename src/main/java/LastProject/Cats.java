package LastProject;

import java.util.Objects;

//1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
//
//а) информационной системой ветеринарной клиники
//
//Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет и возраст (или другие параметры на ваше усмотрение).
//Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
//Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество.
//
//Создайте метод public boolean equals(Object o)
//
//Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
//Переопределите метод хэшкод, пусть возвращает айди животного.
//
//Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
public class Cats {
    int age;
    String nickname;
    String gender;
    String nameOwner;
    String breed;
    int id;


    @Override
    public String toString() {
         return String.format( "id:" + id+ "," + "nickname:" + nickname+ "," + "age:" + age + ","+ "gender:" + gender +","+ "nameOwner:" + nameOwner);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cats cats)) return false;
        return age == cats.age && id == cats.id && Objects.equals(nickname, cats.nickname) && Objects.equals(gender, cats.gender) && Objects.equals(nameOwner, cats.nameOwner) && Objects.equals(breed, cats.breed);
    }

    @Override
    public int hashCode() {
        return id;
    }
}
