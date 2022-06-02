import React from "react";
import "./Info.css";

function Info() {
  let name = "홍길동";
  let gender = "남성";
  let age = 24;
  let email = "gildong@gmail.com";
  let address = "부산광역시 전포대로 100길 100";
  return (
    <div>
      <label for="user-name">이름 : </label>
      <h3 className="inlines" id="user-name">
        {name}
      </h3>
      <br />
      <label for="user-age">나이 : </label>
      <h3 className="inlines" id="user-age">
        {age}
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
      <label for="user-addr">주소 : </label>
      <h3 className="inlines" id="user-addr">
        {address}
      </h3>
      <br />
    </div>
  );
}

export default Info;
