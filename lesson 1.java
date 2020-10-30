/*
Добрый вечер Максим! Подготовил домашнее задание по 1 уроку, прошу вас строго не судить, не знаю точного формата оформления
ДЗ, как и что должно быть ( если будут какие нибудь пояснения как лучше делать буду признателен) я к некоторым примерам приводил
несколько вариантов решения, если будет время поссмотрите мб они не все точно соответсвуют заданию, я в некоторых добавлял от себя,
если так делать нельзя отпишитесь пожалуйста. Спасибо за внимание!
смысл всех заданий уловил мб где будут ошибки исправлю)
*/

class Main {

  // Первое задание: 

  public static void main(String[] args) {

  }

// Второе задание: 
 byte a = 10;
 int b = 105;
 short c = 12;
 long d = 2666;
 double e = 25.6;
 float f = 255.56f;
 String g = "Hello";
 char r = '1'; // не проходили на уроке, но я вкурсе что он есть)
 boolean s = true;

//Третье задание, проинициализировал данные в первом варианте, на всякий случай сделаю второй без инициализации:

static void Result(){
int a = 10;
int b = 15;
int c = 20;
int d = 25;
int answer = a * (b + (c / d));
System.out.println(answer);
return;
}
static void ResultTwo( int a, int b, int c, int d) {
  a * (b + (c / d));
   return;
}
// Четвертое задание 
static void Summa(int a, int b){
   a + b >= 10 && a + b <= 20;
return;
}
// Пятое задание
  static void Numbers(){ // можно через Numbers(int = a)
int a = -10; 
if (a >= 0) {
System.out.println("Число положительное");
} else
System.out.println("Число отрицательное");  

var2 

static void DRD(){
  int a = 10;
System.out.println(a < 0 ? "-" : "+");
}
// Шестое задание
 static void NumbersTwo () {
int a = 20; 
if (a < 0) {
return;
} else
System.out.println("Число отрицательное");  
}
//var 2 
static void boolean sixth ( int i) {
  return i < 0;
}
// Седьмое задание

static void Dorof(String name){
  System.out.println ("Привет"+ " " + name);
}

// Восьмое задание
static boolean Year ( int year) {
  100 % year !=0 && 4 % year ==0 || 400 % year == 0;
  return;
}
var 2 

int g = 400;
        if (g % 4 == 0) {
            if ((g % 100 != 0) || (g % 400 == 0)) {
                System.out.println("високосный");
            } else {
              System.out.println(" не високосный");
            }
        }

}







