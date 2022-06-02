// ES6의 변수 키워드
// let, const

var varA = 10;
let letA = 10;
const constA = 10;

console.log('var로 선언한 변수 : ' + varA);
console.log('let으로 선언한 변수 : ' + letA);
console.log('const로 선언한 변수 : ' + constA);

varA = 20;
letA = 20;
// constA = 20; // const 키워드로 생성한 변수는 데이터의 재할당 불가

console.log('var로 선언한 변수에 재할당 : ' + varA);
console.log('let으로 선언한 변수에 재할당 : ' + letA);
console.log('const로 선언한 변수에 재할당 : ' + constA);

console.log('-------------------------------------');

var varA = 30;
// let letA = 30; // 동일한 범위 내에서 동일한 이름을 변수를 재선언 할 수 없음

console.log(varA);
var varA;
console.log(varA);

if (true) {
  var varB = 10;
  let letB = 10;
  console.log('if문의 코드블럭에서 선언된 var 변수 : ' + varB);
  console.log('if문의 코드블럭에서 선언된 let 변수 : ' + letB);
}

console.log('if문 밖에서 호출한 var 변수 : ' + varB);
// console.log('if문 밖에서 호출한 let 변수 : ' + letB);

console.log('-------------------------------------');
// const로 선언한 변수에 데이터가 존재하는 주소를 할당하는 형태임
const info = { name: '홍길동', age: 24 };
console.log(info);
// const로 선언한 변수의 전체 주소는 바뀌지 않기 때문에 오류가 발생하지 않고, 내부의 데이터만 변경됨
info.age = 30;
console.log(info);
info.job = 'aaa';
console.log(info);
// 아래의 소스코드는 데이터가 존재하는 주소 자체를 변경하기 때문에 오류가 발생함
// info = { age: 30, job: '회사원' };
// console.log(info);

console.log('---------------------------------------');
// 무결성 내장함수 사용

const arr1 = [1, 2, 3];
const arr2 = [1, 2, 3];

console.log('원본 배열 arr1 : ' + arr1);
arr1.push(4);
arr1.push(5);
console.log('수정된 배열 arr1 : ' + arr1);
// 무결성 내장함수 사용
console.log('원본 배열 arr2 : ' + arr2);
const arr3 = arr2.concat(4);
const arr4 = arr3.concat(5);
console.log('무결성 내장함수로 수정된 배열 : ' + arr4);

arr1.pop();
arr1.pop();
console.log('가변 내장함수를 사용하여 수정 : ' + arr1);
const arr5 = arr4.slice(0, arr4.length - 1);
const arr6 = arr5.slice(0, arr5.length - 1);
console.log('무결성 내장함수를 사용하여 수정 : ' + arr6);
