var query = '?banana=100&apple=20&orange=30';

function parse1(qs){
    const queryString = qs.substr(1);
    const chunks = queryString.split('&');
    const result = chunks.map((chunk) => {
        const [key, value] = chunk.split('=');
        return{key : key, value: value};
    });
    return result;0.
}

console.log(parse1(query));

const oriArr = [1,2,3,4,5];
const targetArr = oriArr.map((item, index, arr) => {
    console.log(`전체 배열 : ${arr}`);
    console.log(`현재 index : ${index}`);
    console.log(`현재 index의 값 : ${item}`);
    console.log(item, index, arr);
    return item;
});

console.log(targetArr);
