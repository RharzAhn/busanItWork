// Axios 란?
// 자바스크립트로 비동기 통신을 할 수 있도록 해주는 모듈
// 자바스크립트에는 기본적으로 비동기 통신을 위한 XHR(XML Http Request)라는 것이 존재함
// XHR을 사용하여 ajax통신하는데 사용함(사용법이 어려움)
// jquary를 사용 시 ajax통신을 쉽게 할 수 있음 $.ajax ~
// frontend 개발 시 jquery의 각종 문제점 때문에 jquery를 사용하지 않게 되면서 비동기 통신을 쉽게할 수 있는 방법이 필요함
// React 및 Vue.js에서는 Axios 모듈을 사용하여 비동기 통신을 구현함

//Axios 설치
// > yarn add axios

// axios 모듈 불러오기
// import axios from 'axios'

// axios 사용법
// axios.통신방식(서버주소).then(콜백함수).catch(콜백함수)

//import axios from 'axios';
const axios = require('axios').default;

//console.log('axios 테스트');

axios
.get('https://yts.mx/api/v2/list_movies.json')
.then((response) => {
        console.log(response);
})
.catch((error) => {
    console.log(error);
});