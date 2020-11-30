# MusicAdvisor
Project: Music Advisor
CLI app using Spotify API to create a personal music advisor that makes preference-based suggestions and even shares links to new releases and featured playlists.

## How to run
In root of the project:

    > gradle run -q --console=plain
    
    
## Parameters
`-access`

Authorization server path. If it isn't set, default server is https://accounts.spotify.com

`-resource`

API server path. If it isn't set, default server is https://api.spotify.com

`-page`

Number of entries that should be shown on a page. If it isn't set, default value is 5.

## Info

Project from JetBrains Academy, HyperSkill platform

Program that makes preference-based suggestions and even shares links to new releases and featured playlists.

Together with Spotify, it is a powerful guide to the world of music.

Stack: Java 11, Google gson 2.8.6, Spotify API

## Commands:

auth
featured
new
categories
playlists
exit

