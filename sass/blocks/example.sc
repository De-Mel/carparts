.example {
  background-color: #eaeaea;
  // padding-bottom: 42px;

  &__content {
    @media (min-width: $desktop-width) {
      background-color: #eaeaea;
      display: flex;
      // align-items: center;
      padding-top: 70px;

      &-item {
        margin: 0 88px 0 0;
      }
    }
  }

  @media (min-width: $tablet-width) {
    background-color: inherit;
    // border-top: 1px solid #e6e6e6;
    border-top: none;
    // padding-bottom: 250px;
    padding-bottom: 0;
    position: relative;

    &::before {
      content: "";
      width: 100%;
      height: 48%;
      bottom: 0;
      position: absolute;
      background-color: #eaeaea;
    }
  }

  @media (min-width: $desktop-width) {
    &::before {
      background-color: transparent;
    }
  }

  // @media (min-width: $desktop-width) {
  //   display: flex;
  // }
}

.example__title {
  margin: 0;
  padding-top: 27px;
  padding-bottom: 33px;
  font-size: 36px;
  line-height: 40px;

  @media (min-width: $tablet-width) {
    font-size: 60px;
    line-height: 60px;
    padding-top: 68px;
    padding-bottom: 63px;
  }

  @media (min-width: $desktop-width) {
    padding-top: 47px;
    padding-bottom: 76px;
  }
}

.example__text {
  margin: 0;

  @media (min-width: $tablet-width) {
    font-size: 16px;
    line-height: 24px;
    padding-right: 6px;
  }

  @media (min-width: $desktop-width) {
    max-width: 437px;
  }
}

.example__wrapper {
  @media (min-width: $tablet-width) {
    // max-width: 366px;
    margin: 0;
    display: grid;
    grid-template-columns: 366px auto;
  }

  @media (min-width: $desktop-width) {
    // display: flex;
    // flex-direction: column;
  }
}

.example__table {
  display: grid;
  grid-template-columns: 1fr 1fr;
  grid-column-gap: 31px;
  padding-top: 22px;
  margin: 0;

  @media (min-width: $tablet-width) {
    padding-top: 54px;
    grid-column-gap: 40px;
  }

  @media (min-width: $desktop-width) {
    padding-top: 68px;
  }
}

.example__both {
  font-size: 24px;
  line-height: 24px;
  text-align: center;
  text-transform: uppercase;
  border: 1px solid $special_grey;
  border-radius: 3px;
  padding: 15px 0 18px;

  &-text {
    font-size: 12px;
    line-height: 12px;
    margin: -9px 21px 0;
    grid-row: 2/2;
    // padding-top: 0px;
    padding-bottom: 25px;
    text-align: center;
    background-color: #eaeaea;
  }

  @media (min-width: $tablet-width) {
    font-size: 30px;
    line-height: 37px;

    &-text {
      font-size: 14px;
      line-height: 14px;
      background-color: $basic_white;
      margin: -9px 10px 0;
    }
  }

  @media (min-width: $desktop-width) {
    &-text {
      background-color: #eaeaea;
    }
  }
}

.example__total {
  font-size: 14px;
  line-height: 20px;
  text-align: center;
  text-transform: uppercase;
  margin-top: -7px;

  @media (min-width: $tablet-width) {
    font-size: 20px;
    line-height: 20px;
    // display: grid;
    // grid-template-columns: 1fr 1fr;
    text-align: right;
    padding-top: 72px;

    & span {
      display: inline-block;
      margin-top: 10px;
    }
  }

  @media (min-width: $desktop-width) {
    grid-column: 1/2;
    text-align-last: left;
    padding-top: 39px;

    & span {
      margin-left: 63px;
    }
  }
}

.example__total br {
  display: none;

  @media (min-width: $tablet-width) {
    display: block;
    padding-bottom: 9px;
  }

  @media (min-width: $desktop-width) {
    display: none;
  }
}
