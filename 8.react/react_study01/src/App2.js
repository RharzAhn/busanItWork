//컴포넌트의 부모 태그는 1개만 존재해야 함
//div 밑에 div를 하나 더 만들려고 하면 오류가 생김
//return 뒤에 사용되는 jsx 문법 중 단일 코드로 사용될 경우 괄호를 사용하지 않아도 됨
// 2줄 이상의 내용을 입력할 경우는 괄호를 사용하여 감싸야 한다.

function App2(){
    return(
        <div>
            <h1>App2 파일 생성</h1>
            <h2>추가로 한번 만들어 봄..</h2>
        </div>
    )

    //return <h1>이렇게 한줄 출력</h1>;
}

export default App2;