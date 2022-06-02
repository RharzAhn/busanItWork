console.log('\n----- 객체 확장 표현식 사용하기 -----\n');

console.log('\n----- 기존 Es5의 객체 표현식 -----\n');

var x = 0;
var y = 0;
var obj = { x: x, y: y };
var randomKeyString = 'other';
var combined = {};
combined['one' + randomKeyString] = 'some value';
var obj2 = {
  x: x,
  methodA: function () {
    console.log('methodA A');
  },
  methodB: function () {
    return 0;
  },
};
