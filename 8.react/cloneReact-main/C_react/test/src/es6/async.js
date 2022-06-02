// 비동기 처리 사용하기

console.log('시작과 동시에 실행하는 부분');
setTimeout(function(){
    console.log('5초후에 실행되는 부분');}, 5000
);

console.log('마지막에 실행되는 부분')
;