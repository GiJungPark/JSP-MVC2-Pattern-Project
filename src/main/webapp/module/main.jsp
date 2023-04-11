<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
    
<div class="mainContent">
	<h1 id="main_title">박스 오피스</h1>
	<hr id="main_title_hr">
	<section id="top_rated">
		<h2>인기 영화</h2>
		<div id="slider">

    <input type="radio" name="slider" id="slide1" checked>
    <input type="radio" name="slider" id="slide2">
    <input type="radio" name="slider" id="slide3">
    <input type="radio" name="slider" id="slide4">
    <input type="radio" name="slider" id="slide5">

    <div id="slides">
      <div id="overflow">
        <div class="inner">

          <div class="slide slide_1">
            <div class="slide-content">
              <h2>Slide1</h2>
              <p>Content for Slide 1</p>
            </div>
          </div>

          <div class="slide slide_2">
            <div class="slide-content">
              <h2>Slide2</h2>
              <p>Content for Slide 2</p>
            </div>
          </div>

          <div class="slide slide_3">
            <div class="slide-content">
              <h2>Slide3</h2>
              <p>Content for Slide 3</p>
            </div>
          </div>

          <div class="slide slide_4">
            <div class="slide-content">
              <h2>Slide4</h2>
              <p>Content for Slide 4</p>
            </div>
          </div>

          <div class="slide slide_5">
            <div class="slide-content">
              <h2>Slide5</h2>
              <p>Content for Slide 5</p>
            </div>
          </div>

        </div>
      </div>
    </div>
    
    <div id="controls">
      <label for="slide1"></label>
      <label for="slide2"></label>
      <label for="slide3"></label>
      <label for="slide4"></label>
      <label for="slide5"></label>
    </div>
    <div id="bullets">
      <label for="label1"></label>
      <label for="label2"></label>
      <label for="label3"></label>
      <label for="label4"></label>
      <label for="label5"></label>
    </div>

  </div>
	</section>
</div>
