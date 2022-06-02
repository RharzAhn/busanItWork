console.log('클래스 사용하기2');

console.log('\n----- ES6의 클래스 사용하기 -----\n');

class Shape {
  static create(x, y) {
    return new Shape(x, y);
  }

  name = 'shape';

  // 클래스의 생성자, 생성자 명이 지정되어 있음
  constructor(x, y) {
    this.move(x, y);
  }

  move(x, y) {
    this.x = x;
    this.y = y;
  }

  area() {
    return 0;
  }
}

var s = new Shape(0, 0);
console.log(s.area());

class Circle extends Shape {
  constructor(x, y, radius) {
    super(x, y);
    this.radius = radius; // 객체의 멤버 변수 선언
  }

  area() {
    if (this.radius === 0) {
      return super.area();
    }
    return this.radius * this.radius;
  }
}

var c = new Circle(0, 0, 10);
console.log(c.area());
