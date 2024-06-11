
function Hero ({heroName}) {
    if (heroName === "Joker") {
        throw new  Error("Not a Hero")
    }

    return <h1>{heroName}</h1>
}

export default Hero