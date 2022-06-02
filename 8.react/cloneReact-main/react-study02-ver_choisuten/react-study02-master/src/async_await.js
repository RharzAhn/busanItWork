//async/await
//비동기 로직을 처리하기 위한 최신 방법
//ES2017 버전에 추가된 새로운 비동기 로직 처리 방식
// async 키워드를 사용 시 해당 함수내에서 비동기 처리가 필요한 메서드가 있음을 알려줌
// await 키워드 사용 시 해당 매서드의 비동기 처리가 완료될 때까지 로직을 실행하지 않고 기다려 줌
//사용법
// async function 함수명(){
//     await 비동기 처리 메서드명();
// }

const axios = require('axios').default

// 비동기 방식을 사용하지 않았을 경우
// 정상적인 동작은 되지 않지만 프로그램의 흐름을 파악하기는 쉬움
function logName(userId){
    var login = axios.get('http://localhost:8080?userId=' + userId);

    if(login.auth === "success"){
        console.log(user.name);
    }
}

// function logName(userId){
//     var login = axios.get('http://localhost:8080?userId=' + userId, function (res){
//         if(res.auth === "success"){
//             console.log(res.name);
//         }
//     });  
// }

//비동기 방식을 사용했을 경우(promise)
//비동기 방식 혹은 콜백 방식에 대한 이해가 있을 경우에만 프로그램의 흐름을 파악할 수 있음
function logName(userId){
    axios.get('http://localhost:8080?userId=' + userId).then((res) => {
        if(res.auth === "success"){
            console.log(res.name);
        }
    });    
}

//async / await 를 적용했을 경우
//async/await를 사용하면 콜백에 대한 이해가 없이도 프로그램의 흐름을 쉽게 파악할 수 있음
function logName(userId){
    var login = axios.get('http://localhost:8080?userId=' + userId);

    if(login.auth === "success"){
        console.log(user.name);
    }
}

console.log('로그인 실행');
logName('admin');