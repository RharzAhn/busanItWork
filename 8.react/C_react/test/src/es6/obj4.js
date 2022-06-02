console.log('\n--------- ES6 버전의 구조분해할당 ------------\n');

// 배열을 사용한 구조분해 할당
var list = [0,1]; //배열 list 선언 및 데이터 할당
// ES6의 전개연산방식을 사용하여 변수를 한번에 선언
// 필요한 데이터를 각각 할당
var [item1, item2, item3 = -1] = list;
console.log('변수 item1 : ' + item1);
console.log('변수 item2 : ' + item2);
console.log('변수 item3 : ' + item3);

[item2, item1] = [item1, item2]; //스와핑 기법
console.log("변경된 item1 :" + item1);
console.log("변경된 item2 :" + item2);

// object 타입을 사용한 구조분해할당
var obj = {
    key1: 'one',
    key2: 'two',
};

console.log('원본 obj.key1 : ' + obj.key1);
console.log('원본 obj.key2 : ' + obj.key2);

// key1:newkey1 은 기존 객체 타입이 가지고 있는 요소인 key1을 가져와서 : 기호 뒤에 있는 이름을 변수명으로 사용하고 객체타입의 키와 매칭되는 값을 새로 생성한 변수에 대입함.
var {key1: newKey1, key2, key3 = 'default key3 value' } = obj;
console.log('변수 newkey1 : '+ newKey1);
console.log('변수 key2 : '+ key2);
console.log('변수 key3 : '+ key3);