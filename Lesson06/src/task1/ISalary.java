package task1;
//1. Створити interface Зарплата, в якому передбачити метод зарплата(). Створити клас
//Працівник з погодинною зарплатою, та Працівник з фіксованою місячною зарплатою .
//Реалізувати методи інтерфейсу в к класах : Працівник з погодинною зарплатою, та
//Працівник з фіксованою місячною зарплатою . Формула розрахунку зарплати працівника є
//довільною. Вивести на екран скільки заробляють перший і другий працівники.
//
//2. Створіть інтерфейс Plus, з методoм : додати; Minus, з методoм : відняти; Multiply з
//методoм : помножити; Devide з методoм : поділити; створіть інтерфейс Numerable, який
//наслідуватиметься від інтерфейсів Plus, Minus, Multiply, Devide в пакеті
//com.lgs.lab.interface1. Створіть пакет com.lgs.lab.interface2 в якому створіть клас
//MyCalculator і заімплементіть даному класу інтерфейс Numerable та задайте реалізацію всім
//методам даного інтерфейсу. Створіть метод мейн та створіть об’єкт класу MyCalculator , до
//якоо викличте всі його методи . Результати арифметичних операцій виведіть на консоль.


public interface ISalary {
	int salary(int sal);
}