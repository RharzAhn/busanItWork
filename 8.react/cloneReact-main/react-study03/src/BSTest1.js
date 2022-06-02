import React from 'react';
import { Button } from 'react-bootstrap';

function BSTest1() {
  return (
    <div>
      <h1>기본 방식대로 부트스트랩 사용하기</h1>
      <Button variant="btn">기본 버튼</Button>
      <Button variant="primary">primary 타입</Button>
      <Button variant="success">success 타입</Button>
      <Button variant="outline-info">outline 타입</Button>
      <Button variant="outline-warning">outline 타입</Button>
      <Button variant="danger">테마 색상 danger</Button>
      <Button variant="light">테마 색상 light</Button>
      <Button variant="link">link 버튼용</Button>
    </div>
  );
}

export default BSTest1;
