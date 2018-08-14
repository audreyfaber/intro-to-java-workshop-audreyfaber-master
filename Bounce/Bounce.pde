PImage dog;
int var=2;
int speed=2;
int vary=200;
int speedy=2;
void setup(){
  size(700,500);
  print(var);
dog=loadImage("Dog.jpg");

}
void draw (){
  background(#03CAFA);
 image(dog,var,vary,50,50);
var=var+speed;
if(var > width) {
  speed=-speed;
}
  if(var < 0){
    speed=-speed;
    }
vary=vary+speedy;
if(vary > height){
speedy=-speedy;
}
if(vary < 0){
speedy=-speedy;
}




}