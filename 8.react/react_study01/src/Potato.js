import React from 'react';

function Potato(){
    return<h3>I love potato</h3>;
}

// export : 해당 파일을 외부에서 import을 할 경우 외부에서 지정한 함수, class, 변수 등을
// 사용할수 있도록 설정하는 명령어
// default : 해당 파일을 import 할 경우 기본적으로 사용할 수 있는 함수, class, 변수로 등록
// default를 사용 시 import 할 경우 이름을 원하는 대로 붙여서 사용할 수 있음
export default Potato;

//Named Export 방식을 사용 시 import 하는 부분에서 {함수명, class명, 변수명} 형태로 사용해야 함
// 1번방식(디폴트안쓸시) : export {Potato} from Potato;
// 2번방식 : expott {Potato};