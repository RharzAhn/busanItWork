import React from 'react';
import './Catering.css';

function Catering() {
  return (
    <div>
      {/* nav */}
      <nav className="shadow p-4 mb-4 bg-white fixed-top">
        <div className="row">
          <div className="col-sm-2">
            <a href="#">Gourmet au Catering</a>
          </div>
          <div className="col-sm-3 offset-sm-7 row">
            <div className="col-sm-4">
              <a href="#">About</a>
            </div>
            <div className="col-sm-4">
              <a href="#">Menu</a>
            </div>
            <div className="col-sm-4">
              <a href="#">Contact</a>
            </div>
          </div>
        </div>
      </nav>
      {/* main */}
      <main className="container-fluid">
        {/* header */}
        <header className="row">
          {/* <img src="https://www.w3schools.com/w3images/hamburger.jpg" /> */}
          <img src={require('./hamburger.jpg')} />
        </header>
        <br />
        <br />
        {/* about */}
        <div className="row">
          <div className="col mx-auto">
            <div className="row">
              <div className="col-sm-4 offset-sm-2 p-3 row">
                {/* <img src="https://www.w3schools.com/w3images/tablesetting2.jpg" /> */}
                <img src={require('./tablesetting2.jpg')} />
              </div>
              <div className="col-sm-4 p-3">
                <h1>About Catering</h1>
                <h5>Tradition since 1889</h5>
                <p>
                  The Catering was founded in blabla by Mr. Smith in lorem ipsum dolor sit amet,
                  consectetur adipiscing elit consectetur adipiscing elit, sed do eiusmod tempor
                  incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
                  exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute
                  iruredolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
                  pariatur.We only use seasonal ingredients.
                </p>
                <p>
                  Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt
                  mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod
                  temporincididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis
                  nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
                </p>
              </div>
            </div>
          </div>
        </div>
        <br />
        <hr />
        <br />
        {/* menu */}
        <div className="row">
          <div className="col mx-auto">
            <div className="row">
              <div className="col-sm-4 offset-sm-2 p-3">
                <h1>Our Menu</h1>
                <h3>Bread Basket</h3>
                <p>Assortment of fresh baked fruit breads and muffins 5.50</p>
                <h3>Honey Almond Granola with Fruits</h3>
                <p>Natural cereal of honey toasted oats, raisins, almonds and dates 7.00</p>
                <h3>Belgian Waffle</h3>
                <p>Vanilla flavored batter with malted flour 7.50</p>
                <h3>Scrambled eggs</h3>
                <p>Scrambled eggs, roasted red pepper and garlic, with green onions 7.50</p>
                <h3>Blueberry Pancakes</h3>
                <p>With syrup, butter and lots of berries 8.50</p>
              </div>
              <div className="col-sm-4 p-3 row">
                {/* <img src="https://www.w3schools.com/w3images/tablesetting.jpg" /> */}
                <img src={require('./tablesetting.jpg')} />
              </div>
            </div>
          </div>
        </div>
        <br />
        <hr />
        <br />
        {/* contact */}
        <div className="col-sm-8 offset-sm-2 ">
          <h1>Contact</h1>
          <p>
            We offer full-service catering for any event, large or small. We understand your needs
            and we will cater the food to satisfy the biggerst criteria of them all, both look and
            taste. Do not hesitate to contact us.
          </p>
          <h5 class="point">Catering Service, 42nd Living St, 43043 New York, NY</h5>
          <p>
            You can also contact us by phone 00553123-2323 or email catering@catering.com, or you
            can send us a message here:
          </p>
          <input type="text" class="form-control" placeholder="Name" />
          <input type="text" class="form-control" placeholder="How may people" />
          <input type="datetime-local" class="form-control" value="2022-04-27T20:00" />
          <input type="text" class="form-control" placeholder="Message/Special requirements" />
          <button type="button">SEND MESSAGE</button>
        </div>
      </main>
      {/* footer */}
      <div className="mt-5 p-4 bg-light text-black text-center">
        <p>Powered by w3.css</p>
      </div>
    </div>
  );
}

export default Catering;
