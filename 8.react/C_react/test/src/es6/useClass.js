console.log('클래스 사용하기');

console.log('\n----- 기존 ES5의 클래스 사용 방식 -----\n');

function Shape(x, y) {
  this.name = 'shape';
  this.move(x, y);
}

Shape.create = function (x, y) {
  return new Shape(x, y);
};

Shape.prototype.move = function (x, y) {
  this.x = x;
  this.y = y;
};

Shape.prototype.area = function () {
  return 0;
};

Shape.prototype = {
  move: function (x, y) {
    this.x = x;
    this.y = y;
  },
  area: function () {
    return 0;
  },
};

var s = new Shape(0, 0);
var s2 = Shape.create(0, 0);
console.log(s.area());
