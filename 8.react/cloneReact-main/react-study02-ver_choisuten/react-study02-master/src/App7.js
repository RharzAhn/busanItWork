import React from 'react';
import axios from 'axios';
import Movie from './Movie';

import './App7.css';

class App7 extends React.Component {
  state = {
    isLoading: true,
    movies: [],
  };

  render() {
    const { isLoading, movies } = this.state;
    return (
      <section className="container">
        {isLoading ? (
          <div className="loader">
            <span className="loader-text">Loading...</span>
          </div>
        ) : (
          <div className="movies">
            {movies.map((movie) => {
              return (
                <Movie
                  key={movie.id}
                  id={movie.id}
                  year={movie.year}
                  title={movie.title}
                  summary={movie.summary}
                  poster={movie.medium_cover_image}
                  genres={movie.genres}
                />
              );
            })}
          </div>
        )}
      </section>
    );
  }

  getMovies = async () => {
    try {
      // const movies = await axios.get('https://yts-proxy.now.sh/list_movies.json');
      // console.log('통신 성공');
      // this.setState({ movies: movies.data.data.movies, isLoading: false });
      const {
        data: {
          data: { movies },
        },
      } = await axios.get('https://yts-proxy.now.sh/list_movies.json?limit=5&sort_by=rating');
      this.setState({ movies: movies, isLoading: false });
    } catch (err) {
      console.log('통신 시 오류가 발생했습니다.');
      console.log(err);
    }
  };

  // getMovies = () => {
  //   axios
  //     .get('https://yts-proxy.now.sh/list_movies.json')
  //     .then((res) => {
  //       console.log('통신 성공');
  //       console.log(res);
  //     })
  //     .catch((err) => {
  //       console.log('에러가 발생했습니다.');
  //       console.log(err);
  //     });
  // };

  componentDidMount() {
    // setTimeout(() => {
    //   this.setState({ isLoading: false });
    // }, 5000);
    this.getMovies();
  }
}

export default App7;
