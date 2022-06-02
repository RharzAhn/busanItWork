import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import App2 from './App2';
import Potato from './Potato';
import Potato from './Potato';


// ReactDOM : 리액트의 가상돔을 의미
// createRoot : 리액트의 가상돔을 생성
const root = ReactDOM.createRoot(document.getElementById('root'));
// render : 리액트의 가상돔을 사용하여 실제 화면을 그려줌
// StrictMode : 기본 자바스크립트 언어 규칙을 강력한 규칙으로 적용
//<App /> : 이부분은 사용자 컴포넌트, 실제 리액트를 이용하여 생성한 화면
root.render(
  <React.StrictMode>
    {/* <App2 /> */}
    {/* <Potato /> */}
    <App />
    
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
