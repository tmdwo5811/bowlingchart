$(".textInput input").change(function () {
    if ($(this).val() != "") {
        $(this).addClass('filled');
    } else {
        $(this).removeClass('filled');
    }
})

// 메인 볼링핀
setInterval(function () {
    $('#pins').css({ 'background-position': '-=0.3' });
    $('#joinPins').css({ 'background-position': '-=0.3' });
});

//select box 효과
$('.selectTeam').dropdown();
$('.formSelectTeam').dropdown();