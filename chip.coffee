deviceTypesCommon = require '@resin.io/device-types/common'
{ networkOptions, commonImg, instructions } = deviceTypesCommon

module.exports =
	version: 1
	slug: 'chip'
	aliases: [ 'chip' ]
	name: 'C.H.I.P.'
	arch: 'armv7hf'
	state: 'released'
	isDefault: true

	instructions: commonImg.instructions
	gettingStartedLink:
		windows: 'http://docs.resin.io/chip/nodejs/getting-started/#adding-your-first-device'
		osx: 'http://docs.resin.io/chip/nodejs/getting-started/#adding-your-first-device'
		linux: 'http://docs.resin.io/chip/nodejs/getting-started/#adding-your-first-device'
	supportsBlink: true

	options: [ networkOptions.group ]

	yocto:
		machine: 'chip'
		image: 'resin-image'
		fstype: 'resinos-ubi'
		version: 'yocto-morty'
		deployArtifact: 'resin-image-chip.resinos-ubi'
		compressed: true

	configuration:
		config:
			partition:
				primary: 1
			path: '/config.json'

	initialization: commonImg.initialization
