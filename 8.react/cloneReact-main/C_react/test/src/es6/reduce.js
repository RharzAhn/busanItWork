// reduce() 사용하기
let arrNums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

function sum(numbers) {
    return numbers.reduce((total, num) => total + num, 0);
}

console.log(sum(arrNums));


const query ='?banana=100&apple=20&orange=30';

function parse1(qs){
    const queryString = qs.substr(1);
    const chunks = queryString.split('&');

    // 함수가 끝날때 다른 함수로 넘어가느것을 체인? 체이닝? 
    // 쿼리스트링 문자열을 map()을 사용하여 배열로 생성 후 reduce()를 사용하여
    // 객체타입으로 변환 
    return chunks
    .map(chuck=> {
        const[key, value] = chuck.split('=');
        // 전개연산을 통해서 출력 오브젝트타입(var arr , var value )
        console.log(key, value);
        return {key, value}; 
    })
    
    // ((result , ~ 부터 } 까지 첫번째 매개변수 그다음 {} -< 애가 두번째 (초기값)
    .reduce((result, item)=> { //배열을 객체로 만들어주는 아이=reduce()
        // item = key banana , value 100 이런식으로 들어가있다.
        console.log('--------------------------------');
        result[item.key] = Number(item.value);
       
        return result;
    }, {} );
}
console.log('--------------------------------');
console.log('--------------------------------');
console.log('-----------------------------------------');
console.log(parse1(query));