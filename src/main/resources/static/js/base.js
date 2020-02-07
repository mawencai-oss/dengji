$(function () {
    $.get("/mysrc",function (res) {
        $(".mysrc").text(res)
    })
    $.get("/",function (res) {
        location.href=res
    })
})