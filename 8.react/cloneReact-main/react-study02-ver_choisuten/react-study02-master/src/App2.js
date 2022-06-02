import React from 'react';
import './App.css';
import Food from './Food';

/**
 * 음식 데이터를 출력할 컴포넌트
 * @param {*} 음식 이름
 * @returns 내가 좋아하는 음식 이름
 */
// function Food({ fav }) {
//   return <h1>I like {fav}</h1>;
// }

// 서버에서 전송된 데이터
const foodLike = [
  {
    id: 1,
    name: 'kimchi',
    image:
      'https://www.hwatongkimchi.com/file_data/xyzperi02/2019/12/23/1c1fda9d08f730fdc22ccb951021465a.jpg',
    rating: 4.5,
  },
  {
    id: 2,
    name: 'ramen',
    image: 'https://th.bing.com/th/id/OIP.6YtQBuNn4NUSuVSagWbdGQHaFk?pid=ImgDet&rs=1',
    rating: 4.8,
  },
  {
    id: 3,
    name: 'samgyeopsal',
    image: 'https://mp-seoul-image-production-s3.mangoplate.com/mango_pick/uker6u9xhkr1m8.jpg',
    rating: 5,
  },
  {
    id: 4,
    name: 'chukumi',
    image: 'https://blog.kakaocdn.net/dn/dh9Dqr/btqzsWLoYqY/KgEhm09QyxfW29QfeWlkWk/img.png',
    rating: 5,
  },
  {
    id: 5,
    name: 'jokbal',
    image: 'https://t1.daumcdn.net/cfile/tistory/99FD603E5BF66E6811',
    rating: 5,
  },
];

function App2() {
  return (
    <div>
      <h1>app.js를 app2.js로 대체해서 실습</h1>
      <hr />
      <h3>내가 좋아하는 음식</h3>

      {foodLike.map((dish) => (
        <Food key={dish.id} name={dish.name} picture={dish.image} rating={dish.rating} />
      ))}
    </div>
  );
}

export default App2;
