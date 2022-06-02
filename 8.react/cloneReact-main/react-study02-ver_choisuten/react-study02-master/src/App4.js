import React from 'react';
import './App.css';

// 문제 1) class 형 컴포넌트 App4를 생성하고, 화면에 현재 채널, 볼륨을 표시하고, 볼륨up/down, 채널up/down 버튼을 생성하여 버튼을 클릭시마다 현재 채널 및 볼륨의 크기가 변경되는 프로그램을 작성하세요
// ps1) 볼륨은 0 ~ 15, 0이하로 내려갈 수 없음, 15 이상 올라갈 수 없음
// ps2) 채널은 1 ~ 15, 1 이하로 내려가면 최대값은 15가 출력, 15이상 올라가면 1이 출력
// ps3) 각각 볼륨 및 채널은 1씩 변경될 수 있음

class App4 extends React.Component {
  state = {
    volume: 0,
    channel: 1,
  };

  channelUp = () => {
    // this.setState({ channel: this.state.channel + 1 });
    // if (this.state.channel >= 15) {
    //     this.setState({ channel: 1 });
    // }

    this.setState((state) => ({
      channel: state.channel + 1,
    }));

    if (this.state.channel >= 15) {
      this.setState(() => ({
        channel: 1,
      }));
    }
  };

  channelDown = () => {
    // this.setState({ channel: this.state.channel - 1 });

    // if (this.state.channel <= 1) {
    //   this.setState({ channel: 15 });
    // }

    this.setState((current) => ({
      channel: current.channel - 1,
    }));

    if (this.state.channel <= 1) {
      this.setState(() => ({
        channel: 15,
      }));
    }
  };

  volumeUp = () => {
    // this.setState({ volume: this.state.volume + 1 });

    // if (this.state.volume >= 15) {
    //   this.setState({ volume: 15 });
    // }

    this.setState((current) => ({
      volume: current.volume + 1,
    }));

    if (this.state.volume >= 15) {
      this.setState(() => ({
        volume: 15,
      }));
    }
  };

  volumeDown = () => {
    // this.setState({ volume: this.state.volume - 1 });

    // if (this.state.volume <= 0) {
    //   this.setState({ volume: 0 });
    // }

    this.setState((current) => ({
      volume: current.volume - 1,
    }));

    if (this.state.volume <= 0) {
      this.setState(() => ({
        volume: 0,
      }));
    }
  };

  render() {
    return (
      <div>
        <h3>
          현재 채널 {this.state.channel}, 현재 볼륨 {this.state.volume}
        </h3>
        <button onClick={this.channelUp}>Channel + </button>
        <button onClick={this.channelDown}>Channel - </button>
        <br />
        <button onClick={this.volumeUp}>Volume + </button>
        <button onClick={this.volumeDown}>Volume - </button>
      </div>
    );
  }
}

export default App4;
