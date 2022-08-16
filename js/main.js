// Open menu
const menu = document.querySelector('.menu');
const burgerBtn = menu.querySelector('.burger');

burgerBtn.addEventListener('click', () => {
	menu.classList.toggle('menu--open');
});

// Open modal window
const btnOpen = document.querySelector('.btn--open-modal');
const btnClose = document.querySelector('.btn--close-modal');
const modal = document.querySelector('.search__modal');

const modalViewHandler = () => {
	modal.classList.toggle('modal--open');
}

btnOpen.addEventListener('click', modalViewHandler);
btnClose.addEventListener('click', modalViewHandler);
// btnOpen.addEventListener('click', () => {
// 	modal.classList.toggle('menu--open');
// });
