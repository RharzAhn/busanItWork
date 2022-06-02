import React from 'react';
import './Address.css';

// jsx 문법에서는 html 태그를 사용 시 반드시 시작태그와 끝태그가 존재해야함
// <img> -> <img></img>, <img />, <br> -> <br></br>, <br />, <hr> -> <hr></hr>, <hr />
function Addr(props) {
  const { name, gender, email } = props;

  return (
    <div>
      <hr></hr>
      <div>
        <label for="user-name">이름 : </label>
        <h3 className="inlines" id="user-name">
          {name}
        </h3>
        <br />
        <label for="user-gender">성별 : </label>
        <h3 className="inlines" id="user-gender">
          {gender}
        </h3>
        <br />
        <label for="user-email">이메일 : </label>
        <h3 className="inlines" id="user-email">
          {email}
        </h3>
        <br />
      </div>
    </div>
  );
}

export default Addr;
