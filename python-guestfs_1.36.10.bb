DESCRIPTION = "libguestfs python bindings from http://libguestfs.org/guestfs-python.3.html#using-python-bindings-in-a-virtualenv"

DEPENDS = ""
LICENSE = "LGPLv2+"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=64251c0c2bbd5066a5de90e2e66fd9df"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI = "http://download.libguestfs.org/python/guestfs-${PV}.tar.gz"
SRC_URI[md5sum] = "c56cd849c2e0ad581949c2d29659a579"

# Make sure our source directory (for the build) matches the directory structure in the tarball
S = "${WORKDIR}/guestfs-${PV}"

inherit setuptools
