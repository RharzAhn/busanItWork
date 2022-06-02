import React from 'react';
import './Catering.css';
import { Button } from 'react-bootstrap';
import 'bootstrap/dist/css/bootstrap.min.css';

function Catering() {
  return (
    <div>
      <nav class="navbar navbar-expand-sm bg-white navbar-dark fixed-top">
        <button type="button" class="btn btn-outline-light text-dark">
          Gourmet au Catering
        </button>
        <div class="right">
          <button type="button" class="btn btn-outline-light text-dark">
            About
          </button>
          <button type="button" class="btn btn-outline-light text-dark">
            Menu
          </button>
          <button type="button" class="btn btn-outline-light text-dark">
            Contact
          </button>
        </div>
      </nav>
      <main class="container">
        <div class="row">
          <div class="col mx-auto">
            <img
              src="https://www.w3schools.com/w3images/hamburger.jpg"
              class="rounded"
              alt="Cinque Terre"
            ></img>

            <div class="col-sm-8 border p-5">
              <div class="col-sm-10 offset-sm-1 border p-8">
                <h1>About Catering</h1>
              </div>
              <div class="col-sm-10 offset-sm-1 border p-8">Tradition since 1889</div>
              The Catering was founded in blabla by Mr. Smith in lorem ipsum dolor sit amet,
              consectetur adipiscing elit consectetur adipiscing elit, sed do eiusmod tempor
              incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
              exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute
              iruredolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
              pariatur.We only use seasonal ingredients. Excepteur sint occaecat cupidatat non
              proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur
              adipiscing elit, sed do eiusmod temporincididunt ut labore et dolore magna aliqua. Ut
              enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea
              commodo consequat.
              <img
                src="https://www.w3schools.com/w3images/tablesetting2.jpg"
                class="rounded"
                alt="Cinque Terre"
              ></img>
            </div>
          </div>
        </div>
        <div class="col mx-auto">
          <div class="col-sm-4 border p-4">
            <div class="col-sm-10 offset-sm-1 border p-10">Our Menu</div>
            Bread Basket Assortment of fresh baked fruit breads and muffins 5.50 Honey Almond
            Granola with Fruits Natural cereal of honey toasted oats, raisins, almonds and dates
            7.00 Belgian Waffle Vanilla flavored batter with malted flour 7.50 Scrambled eggs
            Scrambled eggs, roasted red pepper and garlic, with green onions 7.50 Blueberry Pancakes
            With syrup, butter and lots of berries 8.50
            <img
              src="https://www.w3schools.com/w3images/tablesetting.jpg"
              class="rounded"
              alt="Cinque Terre"
            ></img>
          </div>
        </div>
        <div class="col mx-auto">
          <div class="col-sm-4 offset-sm-1 border p-4">Contact</div>
          <div class="col-sm-4 border p-4">
            We offer full-service catering for any event, large or small. We understand your needs
            and we will cater the food to satisfy the biggerst criteria of them all, both look and
            taste. Do not hesitate to contact us. Catering Service, 42nd Living St, 43043 New York,
            NY You can also contact us by phone 00553123-2323 or email catering@catering.com, or you
            can send us a message here:
          </div>
        </div>
      </main>
    </div>
  );
}

export default Catering;
