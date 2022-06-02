// 라이브러리 의존성 관리

// 로딩하는 모듈
import MyModule from './MyModule';
// 모듈 내의 특정함수나 변수를 직접 참조
import {모듈명} from './MyModule';
// 로딩한 모듈의 이름이 다른 모듈의 이름과 겹칠 경우 이름 변경
import {모듈명 as 변경할모듈이름} from './MyModule';

function Func() {
    MyModule();
}

function Func2(){
    console.log();
}

// 외부에서 해당 모듈의 변수나 함수등의 이름을 알려주는 역할
export const CONST_VALUE = 0; // 변수를 외부에 노출하여 외부에서 호출 할 수 있도록 설정
export default new Func(); // default 를 사용 시 모듈 러닝 시 기본으로 참조할 수 있도록 설정