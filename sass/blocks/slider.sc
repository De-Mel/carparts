.slider {
  background-color: #eaeaea;
  padding-bottom: 37px;
  padding-top: 42px;

  &__cats {
    position: relative;
    width: 311px;
    height: 232px;
    background-image: url("../img/cat-before-mobile-1@1x.png"), url("../img/cat-after-mobile-1@1x.png");
    background-repeat: no-repeat, no-repeat;
    background-position: top right, top center;
    margin: 0 auto;

    @media (min-resolution: 2dppx) {
      background-image: url("../img/cat-before-mobile-1@2x.png"), url("../img/cat-after-mobile-1@2x.png");
      background-position: top center, top center;
      background-size: contain;
    }
  }

  &__wrapper {
    padding-top: 33px;
    margin: 0 auto;
    display: flex;
    justify-content: center;
  }

  @media (min-width: $tablet-width) {
    padding-bottom: 64px;
    margin-top: 240px;
    position: relative;
    background-color: transparent;

    &__cats {
      position: relative;
      width: 708px;
      height: 620px;
      background-image: url("../img/cat-all-tablet-1@1x.png");
      top: -247px;
      right: 0;

      @media (min-resolution: 2dppx) {
        background-image: url("../img/cat-all-tablet-1@2x.png");
      }

      @media (min-width: $desktop-width) {
        top: -305px;
        right: 66px;
        width: 690px;
        height: 656px;
        background-image: url("../img/cat-all-desktop-1@1x.png");

        @media (min-resolution: 2dppx) {
          background-image: url("../img/cat-all-desktop-1@2x.png");
        }
      }
    }

    @media (min-width: $desktop-width) {
      margin-top: 0;
    }

    &__wrapper {
      // padding-top: 358px;
      justify-content: space-around;
      max-width: 590px;
      margin-top: -314px;
      padding: 0;

      @media (min-width: $desktop-width) {
        margin: -406px 0 0;
      }
    }

    &__wrapper img {
      width: 428px;
    }
  }
}

.slider__button {
  border: none;
  padding: 0;
  font-family: "Oswald", "Arial", sans-serif;
  font-style: normal;
  font-weight: 400;
  font-size: 16px;
  line-height: 20px;
  text-transform: uppercase;
  color: &basic_black;
  background-color: transparent;
  cursor: pointer;
  margin-right: 14px;
  margin-left: 17px;

  // &-prev {
  //   // padding-left: 42px;
  //   // padding-right: 108px;
  // }

  @media (min-width: $tablet-width) {
    font-size: 20px;
    line-height: 30px;
    border-bottom: 1px dotted rgba(0, 0, 0, 0.4);
    margin-right: 21px;
    margin-left: 20px;

    &:hover {
      border-bottom: 1px solid rgba(0, 0, 0, 0.4);
    }
  }

  @media (min-width: $desktop-width) {
    margin-right: 16px;
    margin-left: 25px;
  }
}

.slidecontainer {
  @media (min-width: $tablet-width) {
    margin-top: 5px;
  }
}

.slider__range {
  appearance: none;
  width: 84px;
  height: 14px;
  border: 1px solid #cdcdcd;
  border-radius: 6px;
  background: $basic_white;
  outline: none;
  padding: 4px 6px;

  &::-webkit-slider-thumb {
    height: 6px;
    width: 35px;
    border-radius: 6px;
    background: $basic_green;
    appearance: none;
  }

  &::-moz-range-thumb {
    height: 6px;
    width: 35px;
    border-radius: 6px;
    background: $basic_green;
    appearance: none;
  }


  @media (min-width: $tablet-width) {
    appearance: none;
    width: 428px;
    height: 6px;
    border-radius: 6px;
    background: #dcdcdc;
    outline: none;

    &::-webkit-slider-thumb {
      appearance: none;
      width: 34px;
      height: 34px;
      background: $basic_green;
      border-radius: 50%;
      cursor: pointer;
      filter: drop-shadow(0 1px 3px rgba(0, 0, 0, 0.16));
      box-shadow: 0 1px 3px rgba(0, 0, 0, 0.16), inset 0 0 0 1px #cdcdcd, inset 0 0 0 12px #ffffff;

      &:hover {
        filter: drop-shadow(0 2px 4px rgba(0, 0, 0, 0.19));
      }

      &:active {
        border: 1px solid $basic_green;
        filter: drop-shadow(0 3px 5px rgba(0, 0, 0, 0.2));
      }
    }

    &::-moz-range-thumb {
      appearance: none;
      width: 34px;
      height: 34px;
      background: $basic_green;
      border-radius: 50%;
      cursor: pointer;
      filter: drop-shadow(0 1px 3px rgba(0, 0, 0, 0.16));
      box-shadow: 0 1px 3px rgba(0, 0, 0, 0.16), inset 0 0 0 1px #cdcdcd, inset 0 0 0 12px #ffffff;

      &:hover {
        filter: drop-shadow(0 2px 4px rgba(0, 0, 0, 0.19));
      }

      &:active {
        border: 1px solid $basic_green;
        filter: drop-shadow(0 3px 5px rgba(0, 0, 0, 0.2));
      }
    }
  }
}
