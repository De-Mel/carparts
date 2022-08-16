.promo {
  background-image: url("../img/bg-mobile-1@1x.jpg");
  background-repeat: no-repeat;
  background-position: center;
  background-size: cover;
  position: relative;
  max-height: 302px;
  margin-bottom: 198px;

  &__img {
    position: relative;
    top: 0;

    @media (min-width: $desktop-width) {
      top: 223px;
    }
  }

  @media (min-resolution: 2dppx) {
    background-image: url("../img/bg-mobile-1@2x.jpg");
  }

  &::before {
    content: "";
    width: 100%;
    height: 100%;
    top: 0;
    // left: 0;
    position: absolute;
    background-color: rgba($basic_green, 0.85);
  }

  &__content {
    position: relative;
    padding-top: 27px;
    padding-bottom: 29px;

    @media (min-width: $tablet-width) {
      padding-left: 87px;
      padding-top: 0;
      padding-bottom: 20px;
    }

    @media (min-width: $desktop-width) {
      // padding-top: 223px;
      top: 223px;
      padding-left: 80px;
    }
  }
}

@media (min-width: $tablet-width) {
  .promo {
    background-image: none;
    max-height: none;
    margin-bottom: 0;

    &::before {
      background-color: $basic_white;
    }

    @media (min-width: $desktop-width) {
      background-image: url("../img/bg-desktop-1@1x.jpg");
      background-repeat: no-repeat;
      background-position: right;
      background-size: 50% 100%;
      position: relative;
      // max-height: 696px;
      top: -140px;
      margin-bottom: -62px;

      &::before {
        content: "";
        width: 50vw;
        height: 100%;
        top: 0;
        left: 50%;
        position: absolute;
        background-color: rgba($basic_green, 0.85);
      }

      @media (min-resolution: 2dppx) {
        background-image: url("../img/bg-desktop-1@2x.jpg");
      }
    }
  }
}

.promo__title {
  font-size: 36px;
  line-height: 36px;
  text-align: center;
  color: $basic_white;
  margin: 0;
  padding-bottom: 25px;

  @media (min-width: $tablet-width) {
    font-size: 60px;
    line-height: 60px;
    color: $basic_black;
    max-width: 414px;
    text-align: left;
    padding-bottom: 41px;
  }
}

.promo__text {
  font-size: 14px;
  line-height: 14px;
  text-align: center;
  text-transform: uppercase;
  color: $basic_white;
  margin: 0;

  @media (min-width: $tablet-width) {
    font-size: 20px;
    line-height: 20px;
    color: $basic_black;
    text-align: left;
    // padding-bottom: 20px;
  }
}

.promo__img img {
  display: block;
  margin: 0 auto;

  @media (min-width: $tablet-width) {
    width: 709px;
  }

  @media (min-width: $desktop-width) {
    width: 552px;
    position: relative;
    bottom: 283px;
    left: 114px;
  }
}

.promo__button {
  display: block;
  padding: 13px 15px;
  font-size: 14px;
  line-height: 18px;
  text-transform: uppercase;

  @media (min-width: $tablet-width) {
    position: absolute;
    top: 29px;
    left: 83px;
    font-size: 20px;
    line-height: 20px;
    max-width: 244px;
    padding: 17px 15px;
  }

  @media (min-width: $desktop-width) {
    top: 32px;
    left: 80px;
  }
}
