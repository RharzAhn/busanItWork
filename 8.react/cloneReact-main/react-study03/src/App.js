// import logo from './logo.svg';
import './App.css';

// import BSTest1 from './BSTest1';
// import BSTest2 from './BSTest2';

// import Home from './Home';
import Catering from './Catering';

// import Button from 'react-bootstrap/Button';
// import Table from 'react-bootstrap/Table';
// import CloseButton from 'react-bootstrap/CloseButton';
// import Dropdown from 'react-bootstrap/Dropdown';

// import { Button, Table, CloseButton, Dropdown } from 'react-bootstrap';

// 리액트용 부트스트랩 사용하기
// 리액트용 부트스트랩 설치
// 기본 설치 방식
// > yarn add react-bootstrap bootstrap

// CDN을 통해서 설치
// index.html에 bootstrap 파일을 로딩(css, js)

// 주의사항
// bootstrap.min.css를 index.js에 import해서 사용해야 함
// CDN 방식으로 사용할 경우에는 index.js에 import를 생략

// import 'bootstrap/dist/css/bootstrap.min.css';

// 리액트용 부트스트랩 태그 로드
// import Button from 'react-bootstrap/Button';
// import { Button } from 'react-bootstrap';

// 리액트용 부트스트랩 태그 사용
// <Button>부트스트랩 버튼</Button>
function App() {
  return (
    <div className="App">
      {/* <BSTest1 /> */}
      {/* <BSTest2 /> */}
      {/* <Home /> */}
      <Catering />
    </div>
  );
}

export default App;
