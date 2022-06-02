import "./App.css";

import Info from "./Info";
import Address from "./Address";

// 문제 1) 컴포넌트 info.js 파일을 생성하고 자신의 간단한 정보를 출력하는 페이지를 화면에 출력하세요
// ps 1) src 폴더 아래에 info.js 생성
// ps 2) 이름, 성별, 나이, 이메일, 주소를 출력
// ps 3) UI 구성은 원하는 방식대로 사용

// 문제 2) 친구의 정보를 출력하는 컴포넌트 address.js 파일을 생성하고 친구의 간단한 정보를 화면에 출력하세요
// ps 1) src 폴더 아래에 컴포넌트 생성, address.js
// ps 2) 이름, 성별, 이메일
// ps 3) UI 구성은 원하는 방식대로 사용
// ps 4) 2명 이상 출력
// ps 5) 친구의 정보를 props를 통해서 하위 컴포넌트로 전달하여 출력
function App() {
  return (
    <div>
      <Info />
      <Address name="아이유" gender="여성" email="ui@gmail.com" />
      <Address name="유재석" gender="남성" email="you@gmail.com" />
      {/* // 자신의 정보를 출력하는 컴포넌트 // 친구 정보를 출력하는 컴포넌트 1 //
      친구 정보를 출력하는 컴포넌트 2 */}
    </div>
  );
}

export default App;
