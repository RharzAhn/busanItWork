console.log('\n----- 기존의 ES6 방식의 화살표함수 사용하기 -----\n');

var add1 = (first, second) => {
  return first + second;
};

var add2 = (first, second) => first + second;

console.log(`함수 add1 실행 : ${add1(10, 20)}`);
console.log(`함수 add2 실행 : ${add2(10, 20)}`);

console.log('함수 add1의 타입 : ' + typeof add1);
console.log('함수 add2의 타입 : ' + typeof add2);

// 반환값이 객체형일 경우 객체를 괄호로 감싸서 출력
var addAndMulti = (first, second) => ({
  add: first + second,
  multi: first * second,
});

function asd(num) {
  value = num;
  return function (value) {
    return num + value;
  };
}

console.log(asd(10));

var add = (num) => (value) => num + value;
add(10);
